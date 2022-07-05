var MARGIN_SIDES = 10;
var MARGIN_BOTTOM = 10;
var TEXTAREA_HEIGHT = 150;
var TEXT_MAP = new Map();
var TEXT_MARGIN = 5;
var TEXT_LINE_SPACING = 5;

var roomImage;
var leonImage;
var sampleText = "I wake up one morning to my alarm clock's annoying ring, my head pounding from lack of sleep. I wish I had a few more minutes, but I already hit snooze on my alarm clock twice. If I don't get out of bed right now I'll be late for school.";

//TODO: refactor: maybe make canvas and context global?

function drawTextAreaBackground(canvas){
    let textArea_width = canvas.width - (MARGIN_SIDES * 2);
    
    let textArea_x = MARGIN_SIDES;
    let textArea_y = canvas.height - TEXTAREA_HEIGHT - MARGIN_BOTTOM;


    let ctx = canvas.getContext('2d');
    //background area
    ctx.fillStyle = '#f4e9f5';
    ctx.fillRect(textArea_x, textArea_y, textArea_width, TEXTAREA_HEIGHT);

    //border
    ctx.beginPath();
    ctx.lineWidth = "2";
    ctx.strokeStyle = "black";
    ctx.rect(textArea_x, textArea_y, textArea_width, TEXTAREA_HEIGHT);  
    ctx.stroke();
}

function drawText(canvas, text){

    let ctx = canvas.getContext("2d");
    ctx.font = "30px verdana";
    ctx.fillStyle = 'black';

    let textLineHeight = ctx.measureText(text).fontBoundingBoxAscent + TEXT_LINE_SPACING;
    let canvasHeight = canvas.height;
    let canvasWidth = canvas.width;
    
    createTextObjectIfNeeded(text, ctx, textLineHeight, canvasWidth);

    let textObj = TEXT_MAP.get(text);
    let paragraph = textObj.paragraphs[textObj.paraIndex];

    //draw everything before current line
    for(let i = 0; i < textObj.lineIndex; i++){
        drawTextLine(paragraph[i], ctx, i, canvasHeight, textLineHeight);
    }

    //draw current line
    let partialText = paragraph[textObj.lineIndex].substring(0, textObj.charIndex + 1)
    drawTextLine(partialText, ctx, textObj.lineIndex, canvasHeight, textLineHeight);
}

function drawTextLine(text, ctx, lineIndex, canvasHeight, textLineHeight){
    ctx.fillText(
        text, 
        MARGIN_SIDES + TEXT_MARGIN , //X
        canvasHeight - TEXTAREA_HEIGHT - MARGIN_BOTTOM + ((lineIndex + 1) * textLineHeight)); //Y
}

function createTextObjectIfNeeded(text, ctx, textLineHeight, canvasWidth){
    let maxLines = Math.floor(TEXTAREA_HEIGHT / textLineHeight)
    let maxTextWidth = canvasWidth - (MARGIN_SIDES * 2) - (TEXT_MARGIN * 2);


    if(!TEXT_MAP.has(text)){

        let textObject = new Object;
        TEXT_MAP.set(text, textObject);

        textObject.charIndex = 0;
        textObject.lineIndex = 0;
        textObject.paraIndex = 0;

        textObject.paragraphs = generateParagraphs(text, ctx, maxLines, maxTextWidth);
    }
}


function generateParagraphs(text, ctx, maxLines, maxTextWidth){

    let textSplits = text.split(" ");
    let lineText = "" + textSplits[0];

    let paragraph = new Array();
    let currLineIndex = 0;
    
    
    let paragraphArray = new Array();
    let PA_index = 0;


    for(let i = 1; i < textSplits.length; i++){

        let nextWord = textSplits[i];
        let tempText = lineText + " " + nextWord;
        let tempMesure = ctx.measureText(tempText);
        

        if(tempMesure.width > maxTextWidth){
            if(currLineIndex > maxLines - 1){
                //make new paragraph and new line
                paragraphArray[PA_index++] = paragraph;
                paragraph = new Array(maxLines);

                currLineIndex = 0;
                paragraph[currLineIndex++] = lineText;
                lineText = "" + nextWord;
                
                
            }else{
                //make new line
                paragraph[currLineIndex++] = lineText;
                lineText = "" + nextWord;
                
            }
        }else{
            lineText += " " + nextWord;
        }
    }
    paragraph[currLineIndex] = lineText;
    paragraphArray[PA_index] = paragraph;

    return paragraphArray;
}

function drawTextArea(canvas, text){
    drawTextAreaBackground(canvas);
    drawText(canvas, text)
}

function drawImages(canvas){
    let ctx = canvas.getContext("2d");
    ctx.drawImage(roomImage, 0, 0);
    ctx.drawImage(leonImage, 300, 0);
}

function draw(){
    let canvas = document.getElementById('VNScreen');
    drawImages(canvas);
    drawTextArea(canvas, sampleText);
}

function load(){
    roomImage = new Image();
    leonImage = new Image();

    roomImage.src = 'img/boyroom.png';
    leonImage.src = 'img/leonVN.png';

    //Load all images before adding keybinds
    //TODO: refactor for multiple images
    roomImage.addEventListener('load', e1 => {
        leonImage.addEventListener('load', e2 => {
            setKeybinds();
        });
    });

}

function setKeybinds(){

    window.addEventListener("keydown", function(event) {
        if (event.defaultPrevented) {
          return; // Do nothing if event already handled
        }
      
        switch(event.code) {
          case "KeyZ":
            draw();
            paragraphAdvance();
            break;
        }
        // Consume the event so it doesn't get handled twice
        event.preventDefault();
      }, true);

}

function paragraphAdvance(){

    let textObj = TEXT_MAP.get(sampleText);
    let paragraphs = textObj.paragraphs;

    let paraIndex = textObj.paraIndex;
    let lineIndex = textObj.lineIndex;
    let charIndex = textObj.charIndex;

    if(charIndex + 1 >= paragraphs[paraIndex][lineIndex].length ){
        if(lineIndex + 1 >= paragraphs[paraIndex].length){
           //new paragraph and new line
           textObj.charIndex = 0;
           textObj.lineIndex = 0;
           textObj.paraIndex++;

        }else{
             //new line
             textObj.charIndex = 0;
             textObj.lineIndex++;

        }
    }else{
        //NO new paragraph OR new line
        textObj.charIndex++;
    }
}

load();
