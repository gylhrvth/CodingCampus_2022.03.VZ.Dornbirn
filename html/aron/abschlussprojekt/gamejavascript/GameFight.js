export const gameFight = [
    {
        id: 1,
        img: "../Picture/Picture_Bandit.webp",
        text: "Gegener L1",
        options: [
            {
                text: "Fight",
                keyboardKeyName: "1",
                transition: (state) => {
                    return ["gameFight", 2]
                },
            },

            {
                text: "Hidden",
                keyboardKeyName: "2",
                transition: (state) => {
                    return ["gameFight", 3]
                },
            },
            {
                text: "Escape",
                keyboardKeyName: "3",
                transition: (state) => {
                    return ["gameFight", 4]
                },
            },

        ]
    },
    {
        id: 2,
        htmlSrc: "../FightGame/index.html",
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            while (true) {
                await new Promise(resolve => setTimeout(resolve, 100));
                const result = localStorage.getItem("gameResult")
                if (result) {
                    localStorage.removeItem("gameResult")
                    if (result == "lost") {
                        nextNode("gameDeath", 1)
                    } else if (result == "won") {
                        nextNode("gameWin", 1)
                    } else if (result == "tie") {
                        nextNode("gameWin", 1)
                    }
                    return
                }
            }
        }
    },
    {
        id: 3,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 3) {
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
                keyboardKeyName: "1",
                transition: (state) => {
                    return ["gameFight", 6]
                },
            },

            {
                text: "Hidden",
                keyboardKeyName: "2",
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
            if (state.stats.dexterity > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 3)
                    return
                }
            }
            nextNode("gameDeath", 1)
        },

    },
    {
        id: 8,
        img: "../Picture/Picture_Bandit.webp",
        text: "Gegener L1",
        options: [
            {
                text: "Fight",
                keyboardKeyName: "1",
                transition: (state) => {
                    return ["gameFight", 9]
                },
            },

            {
                text: "Hidden",
                keyboardKeyName: "2",
                transition: (state) => {
                    return ["gameFight", 10]
                },
            },

        ]
    },
    {
        id: 9,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 8)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 10,
        text: "Hidden",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin", 8)
                    return
                }
            }
            nextNode("gameDeath", 4)
        },

    },
    {
        id: 11,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.intelligence > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameStoryGang4", 2)
                    return
                }
            }
            nextNode("gameDeath", 1)
        },
    },
    {
        id: 12,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.intelligence > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameFight", 13)
                    return
                }
            }
            nextNode("gameDeath", 5)
        },
    },
    {
        id: 13,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.intelligence > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameText", 14)
                    return
                }
            }
            nextNode("gameDeath", 5)
        },
    },
    {
        id: 14,
        text: "Hidden",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameStorGang4", 5)
                    return
                }
            }
            nextNode("gameDeath", 4)
        },

    },
    {
        id: 15,
        text: "Hidden",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameStorGang4", 6)
                    return
                }
            }
            nextNode("gameDeath", 4)
        },

    },
    {
        id: 16,
        text: "Hidden",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameStorGang4", 7)
                    return
                }
            }
            nextNode("gameDeath", 4)
        },

    },
    {
        id: 17,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameFight", 18)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 18,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameFight", 19)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 19,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin",)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 20,
        img: "../Picture/Picture_Bandit.webp",
        text: "Gegener L1",
        options: [
            {
                text: "Fight",
                keyboardKeyName: "1",
                transition: (state) => {
                    return ["gameFight", 21]
                },
            },

            {
                text: "Hidden",
                keyboardKeyName: "2",
                transition: (state) => {
                    return ["gameFight", 22]
                },
            },
            {
                text: "Escape",
                keyboardKeyName: "3",
                transition: (state) => {
                    return ["gameFight", 23]
                },
            },

        ]
    },
    {
        id: 21,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 3) {
                if (Math.random() > 0.10) {
                    //wenn health <= 0 -> gameDeath, 1
                    nextNode("gameFight", 24)
                    return
                }
            }

        }
    },
    {
        id: 22,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.dexterity > 3) {
                if (Math.random() > 0.30) {
                    nextNode("gameEnd", 3)
                    return
                }
            }

        },

    },
    {
        id: 23,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.intelligence > 2) {
                if (Math.random() > 0.30) {
                    nextNode("gameEnd", 6)
                    return
                }
            }

        },
    },
    {
        id: 24,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameEnd", 9)
                    return
                }
            }
            nextNode("gameEnd", 12)
        }
    },
    {
        id: 15,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameFight", 26)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 26,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameFight", 27)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },
    {
        id: 27,
        text: "Es wird gekämpft!!!!1111!!!!",
        init: async (state, nextNode) => {
            await new Promise(resolve => setTimeout(resolve, 3000));
            if (state.stats.strength > 4) {
                if (Math.random() > 0.30) {
                    nextNode("gameWin",)
                    return
                }
            }
            nextNode("gameDeath", 1)
        }
    },

]