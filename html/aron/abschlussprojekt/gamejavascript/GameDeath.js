
export const gameDeath = [
    {
        id: 1,
        htmlSrc : "../gamehtml/anim.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameText", 7]
                }
            },
            {
                text: "New Game",
                transition: (state) => {
                    return ["gameText", 1]
                }
            },
        ]
    },
    {
        id: 2,
        htmlSrc : "../gamehtml/anim.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameStoryGang1", 8]
                }
            },
            {
                text: "New Game",
                transition: (state) => {
                    return ["gameText", 1]
                }
            },
        ]
    },
    {
        id: 3,
        htmlSrc : "../gamehtml/anim.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameText", 7]
                }
            },
            {
                text: "New Game",
                transition: (state) => {
                    return ["gameText", 1]
                }
            },
        ]
    },
    {
        id: 4,
        htmlSrc : "../gamehtml/anim.html",
        img: "",
        options: [
            {
                text: "Continue",
                transition: (state) => {
                    return ["gameStoryGang2Altenativ", 5]
                }
            },
            {
                text: "New Game",
                transition: (state) => {
                    return ["gameText", 1]
                }
            },
        ]
    },
]
