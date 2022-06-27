export const gameStoryGang1 = [
    {
        id: 1,
        img: "../Picture/Picture_Bandit.webp",
        text: "StoryG1",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 2]
                }
            },
          
           ]
    },
    {
        id: 2,
        img: "../Picture/Dorf.jpg",
        text: "StoryG1",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 3]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 1]
                }
            },
           ]
    },
    {
        id: 3,
        img: "../Picture/Dorf.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 4]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 2]
                }
            },
           ]
    },
    {
        id: 4,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 5]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 3]
                }
            },
           ]
    },
    {
        id: 5,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 6]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 4]
                }
            },
           ]
    },
    {
        id: 6,
        img: "../Picture/DorfGate.jpg",
        text: "Der Weg2",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameDialog", 6]
                }
            },

        ]
    },
    {
        id: 7,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Kapitel: 2",
                transition: (state) => {
                    return ["gameStoryGang1", 8]
                }
            },
            
           ]
    },
    {
        id: 8,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Kapitel: 2",
                transition: (state) => {
                    return ["gameStoryGang1", 9]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 7]
                }
            },
            
           ]
    },
    {
        id: 9,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Kapitel: 2",
                transition: (state) => {
                    return ["gameDialog", 9]
                }
            },
            
           ]
    },
    {
        id: 10,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG1 Dorf Tor",
        options: [
            {
                text: "Kapitel: 2",
                transition: (state) => {
                    return ["gameStoryGang1", 11]
                }
            },
            
           ]
    },
   
    {
        id: 11,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang1", 13]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 11]
                }
            },
        ]
    },
    {
        id: 12,
        img: "../Picture/DorfGate.jpg",
        text: "Kaitel3 Story gang 5/2",
        options: [
            {
                text: "Kapitel: 3",
                transition: (state) => {
                    return ["gameStoryGang1", 14]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang1", 12]
                }
            },
        ]
    },

   

]