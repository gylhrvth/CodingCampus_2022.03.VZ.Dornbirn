export const gameStoryGang4 = [
   
    {
        id: 1,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf ",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang4", 2]
                }
            },
           
        ]
    },
    {
    id: 2,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 3]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 1]
            }
        },
      
       ]
},
{
    id: 3,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 3]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 1]
            }
        },
      
       ]
},
{
    id: 4,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameFight", 14]
            }
        },
     
      
       ]
},
{
    id: 5,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameFight", 15]
            }
        },
     
      
       ]
},
{
    id: 6,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameFight", 15]
            }
        },
     
      
       ]
},
{
    id: 7,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 8]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 6]
            }
        },
      
       ]
},
{
    id: 8,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 9]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 7]
            }
        },
      
       ]
},
{
    id: 9,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 10]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 8]
            }
        },
      
       ]
},
{
    id: 10,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 11]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 9]
            }
        },
      
       ]
},
{
    id: 11,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameStoryGang4", 12]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 10]
            }
        },
      
       ]
},
{
    id: 12,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            keyboardKeyName: "Enter",
            transition: (state) => {
                return ["gameEnd", 1]
            }
        },
        {
            text: "Back",
            keyboardKeyName: "ArrowLeft",
            transition: (state) => {
                return ["gameStoryGang4", 11]
            }
        },
      
       ]
},

]