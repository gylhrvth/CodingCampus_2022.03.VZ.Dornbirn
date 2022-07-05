export const gameStoryGang3Alternativ = [

    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "StoryG2/2",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang2Alternativ", 2]
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
                    return ["gameFight", 15]
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
                    return ["gameStoryGang2Alternativ",4]
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
                    return ["gameStoryGang3Alternativ", 5]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang3Alternativ", 3]
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
                    return ["gameStoryGang3Alternativ", 6]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang3Alternativ", 4]
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
                    return ["gameStoryGang3Alternativ", 7]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang3Alternativ", 5]
                }
            },
          
           ]
    },
    {
        id: 7,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "Kapitel 3 StoryGang4/1",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang3Alternativ", 8]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang3Alternativ", 6]
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
                    return ["gameText", 8]
                }
            },
        
          
           ]
    },

]