
export const gameWin = [
    {
        id: 1,
        htmlSrc: "../gamehtml/animWin.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameStoryGang2", 1]
                }
            },

        ]
    },
    {
        id: 2,
        htmlSrc: "../gamehtml/animWin.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameStoryGang1", 1]
                }
            },

        ]
    },
    {
        id: 3,
        htmlSrc: "../gamehtml/animWin.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameStoryGang3", 1]
                }
            },

        ]
    },
]