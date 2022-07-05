export const gameStoryGang5 = [
   
    {
        id: 1,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5", 2]
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
                    return ["gameFight",17 ]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 3]
                }
            },
           
        ]
    },
    {
        id: 5,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5",6 ]
                }
            },
       
           
        ]
    },
    {
        id: 6,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5",7 ]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 4]
                }
            },
           
        ]
    },{
        id: 7,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5",8 ]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 6]
                }
            },
           
        ]
    },{
        id: 8,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5",9 ]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 7]
                }
            },
           
        ]
    },{
        id: 9,
        img: "../Picture/DorfGate.jpg",
        text: "Schlacht",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameFight",20 ]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameStoryGang5", 8]
                }
            },
           
        ]
    },
]