export const gameStoryGang2 = [
    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "StoryG2",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 2]
                }
            },

        ]
    },
    {
        id: 2,
        img: "../Picture/Dorf.jpg",
        text: "StoryG2",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 3]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 1]
                }
            },
        ]
    },
    {
        id: 3,
        img: "../Picture/Dorf.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 4]
                }
            },
            {
                text: "Back",
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
                transition: (state) => {
                    return ["gameStoryGang2", 5]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 3]
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
                text: "Kapitel: 2",
                transition: (state) => {
                    return ["gameStoryGang2", 6]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 4]
                }
            },
        ]
    },
    {
        id: 6,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 7]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 5]
                }
            },
        ]
    },
    {
        id: 7,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameDialog", 7]
                }
            },

        ]
    },
    {
        id: 8,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 9]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 7]
                }
            },
        ]
    },
    {
        id: 9,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 10]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 8]
                }
            },
        ]
    },
    {
        id: 10,
        img: "../Picture/Guard.jpg",
        text: "Entscheidung Burgermeister",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameDialog", 8]
                }
            },

        ]
    },
    {
        id: 11,
        img: "../Picture/DorfGate.jpg",
        text: "Viezeburgermeister",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 12]
                }
            },

        ]
    },
    {
        id: 12,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2", 13]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 11]
                }
            },
        ]
    },
    {
        id: 13,
        img: "../Picture/DorfGate.jpg",
        text: "Kaitel3 Story gang 5/2",
        options: [
            {
                text: "Kapitel: 3",
                transition: (state) => {
                    return ["gameStoryGang2", 14]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameStoryGang2", 12]
                }
            },
        ]
    },


]