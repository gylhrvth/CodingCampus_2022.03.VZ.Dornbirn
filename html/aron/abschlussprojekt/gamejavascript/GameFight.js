export const gameFight = [
    {
        id: 1,
        img: "../Picture/Picture_Bandit.webp",
        text: "Gegener L1",
        options: [
            {
                text: "Fight",
                transition: (state) => {
                    return ["gameFight", 2]
                },
            },

            {
                text: "Hidden",
                transition: (state) => {
                    return ["gameFight", 3]
                },
            },
            {
                text: "Escape",
                transition: (state) => {
                    return ["gameFight", 4]
                },
            },

        ]
    },
    {
        id: 2,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 3) {
                if (Math.random() > 0.10) {
                    nextNode("gameWin", 1)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 3,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity> 3) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 2)
                    return
                }
            }
            nextNode("gameDeath", 1)
        },

    },
    {
        id: 4,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.intelligence > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 2)
                    return
                }
            }
            nextNode("gameDeath", 1)
        },
    },
    {
        id: 5,
        img: "../Picture/Picture_Bandit.webp",
        text: "Gegener L1",
        options: [
            {
                text: "Fight",
                transition: (state) => {
                    return ["gameFight", 6]
                },
            },

            {
                text: "Hidden",
                transition: (state) => {
                    return ["gameFight", 7]
                },
            },
        
        ]
    },
    {
        id: 6,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 3)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 7,
        text: "Hidden",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity> 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 3)
                    return
                }
            }
            nextNode("gameDeath", 1)
        },

    },
    
    

]