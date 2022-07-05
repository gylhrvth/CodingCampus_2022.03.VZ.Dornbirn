export const gameStoryGang5Alternativ = [

    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "StoryG2/2",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5Alternativ", 2]
                }
            },
      
          
           ]
    },
    {
        id: 2,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5", 3]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 1]
                }
            },
           
        ]
    },
    {
        id: 3,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5",4]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 2]
                }
            },
           
        ]
    },
    {
        id: 4,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameFight",25 ]
                }
            },
        ]
    }
]