export const gameStoryGang5 = [
   
    {
        id: 1,
        img: "../Picture/DorfGate.jpg",
        text: "StoryG2 Dorf Tor",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang3", 2]
                }
            },
           
        ]
    },
]