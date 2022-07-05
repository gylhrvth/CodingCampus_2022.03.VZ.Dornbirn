export const gameStoryGang3 = [
   
        {
            id: 1,
            img: "../Picture/DorfGate.jpg",
            text: "StoryG2 Dorf Tor",
            options: [
                {
                    text: "Next",
                    keyboardKeyName: "Enter",
                    transition: (state) => {
                        return ["gameStoryGang3", 2]
                    }
                },
               
            ]
        },
        {
            id: 2,
            img: "../Picture/DorfGate.jpg",
            text: "StoryG2 Dorf Tor",
            options: [
                {
                    text: "Kapitel: 2",
                    keyboardKeyName: "Enter",
                    transition: (state) => {
                        return ["gameStoryGang3", 3]
                    }
                },
                {
                    text: "Back",
                    keyboardKeyName: "ArrowLeft",
                    transition: (state) => {
                        return ["gameStoryGang3", 1]
                    }
                },
            ]
        },
        {
            id: 3,
            img: "../Picture/DorfGate.jpg",
            text: "StoryG2 Dorf Tor",
            options: [
                {
                    text: "Next",
                    keyboardKeyName: "Enter",
                    transition: (state) => {
                        return ["gameStoryGang3", 4]
                    }
                },
                {
                    text: "Back",
                    keyboardKeyName: "ArrowLeft",
                    transition: (state) => {
                        return ["gameStoryGang2", 2]
                    }
                },
            ]
        },
        {
            id: 4,
            img: "../Picture/DorfGate.jpg",
            text: "StoryG2 Dorf Tor",
            options: [
                {
                    text: "Next",
                    keyboardKeyName: "Enter",
                    transition: (state) => {
                        return ["gameDialog", 7]
                    }
                },
    
            ]
        },
        {
            id: 5,
            img: "../Picture/DorfGate.jpg",
            text: "StoryG2 Dorf Tor",
            options: [
                {
                    text: "Next",
                    keyboardKeyName: "Enter",
                    transition: (state) => {
                        return ["gameStoryGang2", 6]
                    }
                },
               
            ]
        },
]