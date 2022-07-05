export const gameText = [
    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea ",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 2]
                }
            },
        ]
    },
    {
        id: 2,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "Story 2",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 1]
                }
            },
        ]
    },
    {
        id: 3,
        img: "../Picture/king.jpg",
        text: "Story 2",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameDialog", 1]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 2]
                }
            },
        ]
    },

    {
        id: 4,
        img: "../Picture/king.jpg",
        text: "Story",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 5]
                }
            },
        ]
    },

    {
        id: 5,
        img: "../Picture/Kingdom.jpg",
        text: "Der Aufbruch",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 6]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 4]
                }
            },

        ]
    },
    {
        id: 6,
        img: "../Picture/Picture_Road.jpg",
        text: "Der Weg1",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 7]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 5]
                }
            },

        ]
    },
    {
        id: 7,
        img: "../Picture/Picture_Road.jpg",
        text: "Der Weg2",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameFight", 1]
                }
            },

        ]
    },
    {
        id: 8,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameFight", 8]
                }
            },

        ]
    },
    {
        id: 9,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 10]
                }
            },

        ]
    },
    {
        id: 10,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 11]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 9]
                }
            },

        ]
    },
    {
        id: 11,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 11]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 9]
                }
            },

        ]
    },
    {
        id: 11,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 11]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 9]
                }
            },

        ]
    },
    {
        id: 9,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameDialog", 13]
                }
            },

        ]
    },
    {
        id: 10,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 11]
                }
            },

        ]
    },
    {
        id: 11,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 12]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 10]
                }
            },

        ]
    },
    {
        id: 12,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 13]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 11]
                }
            },

        ]
    },
    {
        id: 13,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Story Gang 4/2",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang4", 1]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 12]
                }
            },

        ]
    },
    {
        id: 14,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 15]
                }
            },

        ]
    },
    {
        id: 15,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 16]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 14]
                }
            },

        ]
    },
    {
        id: 16,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Next",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameText", 17]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 15]
                }
            },

        ]
    },
    {
        id: 17,
        img: "../Picture/Picture_Road.jpg",
        text: "Fight VIzB",
        options: [
            {
                text: "Story Gang 4/2",
                keyboardKeyName: "Enter",
                transition: (state) => {
                    return ["gameStoryGang5", 1]
                }
            },
            {
                text: "Back",
                keyboardKeyName: "ArrowLeft",
                transition: (state) => {
                    return ["gameText", 16]
                }
            },

        ]
    },


]



