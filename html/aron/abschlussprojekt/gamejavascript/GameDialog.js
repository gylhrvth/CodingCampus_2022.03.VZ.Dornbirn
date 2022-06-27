export const gameDialog = [

    {
        id: 1,
        img: "../Picture/king.jpg",
        text: "Story 3",
        options: [
            {
                text: "Bandit",
                transition: (state) => {
                    return ["gameDialog", 2]
                }
            },
            {
                text: "Mercenary",
                transition: (state) => {
                    return ["gameDialog", 3]
                }
            },
            {

                text: "Magician",
                transition: (state) => {
                    return ["gameDialog", 4]
                }
            },
            {

                text: "Vagabond",
                transition: (state) => {
                    return ["gameDialog", 5]
                }
            },

        ]
    },
    {
        id: 2,
        img: "../Picture/Picture_Bandit_Hero.webp",
        text: "Bandit\n*Strength:3/5\n*Intelligence:2/5\n*Dexterity:5/5",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    state.stats = {
                        strength: 3,
                        intelligence: 2,
                        dexterity: 5
                    }
                    return ["gameText", 4]
                },
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
        ]
    },
    {
        id: 3,
        img: "../Picture/Picture_Mercenary+.webp",
        text: "Mercenary\n*Strength:5/5\n*Intelligence:2/5\n*Dexterity:3/5",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    state.stats = {
                        strength: 5,
                        intelligence: 2,
                        dexterity: 3
                    }
                    return ["gameText", 4]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
        ]
    },
    {
        id: 4,
        img: "../Picture/Picture_Magician.png",
        text: "Magician\n*Strength:2/5\n*Intelligence:5/5\n*Dexterity:3/5",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    state.stats = {
                        strength: 2,
                        intelligence: 5,
                        dexterity: 3
                    }
                    return ["gameText", 4]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
        ]
    },
    {
        id: 5,
        img: "../Picture/Picture_Vagabond.webp",
        text: "Vagabond\n*Strength:4/5\n*Intelligence:3/5\n*Dexterity:3/5",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    state.stats = {
                        strength: 4,
                        intelligence: 3,
                        dexterity: 3
                    }
                    return ["gameText", 4]
                }
            },
            {
                text: "Back",
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
        ]
    },
    {
        id: 6,
        img: "../Picture/Guard.jpg",
        text: "Text",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 0));
            if (state.stats.intelligence > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameStoryGang1", 7)
                    return
                }
            }
            nextNode("gameFight", 5)
        }
    },
    {
        id: 7,
        img: "../Picture/king.jpg",
        text: "Story 3",
        options: [
            {
                text: "Burgermeister SG2",
                transition: (state) => {
                    return ["gameStoryGang2", 8]
                }
            },
            {
                text: "Bar SG2/1",
                transition: (state) => {
                    return ["gameStoryGang2Alternativ", 1]
                }
            },
        ]
    },
    {
        id: 8,
        img: "../Picture/Guard.jpg",
        text: "Entscheidung des Burgermeister",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 0));
            if (state.stats.intelligence > 4) {
                if (Math.random() > 0.10) {
                    nextNode("gameStoryGang2", 11)
                    return
                }
            }
            nextNode("gameStoryGang2Alternativ", 2)
        }
    },

]