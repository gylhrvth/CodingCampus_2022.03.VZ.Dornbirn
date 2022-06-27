export const gameText = [
    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "Story",
        options: [
            {
                text: "Next",
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
                transition: (state) => {
                    return ["gameText", 3]
                }
            },
            {
                text: "Back",
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
                transition: (state) => {
                    return ["gameDialog", 1]
                }
            },
            {
                text: "Back",
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
                transition: (state) => {
                    return ["gameText", 6]
                }
            },
            {
                text: "Back",
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
                transition: (state) => {
                    return ["gameText", 7]
                }
            },
            {
                text: "Back",
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
                transition: (state) => {
                    return ["gameFight",1]
                }
            },

        ]
    },


]



