export const gameStoryGang5Alternativ = [

    {
        id: 1,
        img: "../Picture/Festung_Kingdom.jpg",
        text: "StoryG2/2",
        options: [
            {
                text: "Next",
                transition: (state) => {
                    return ["gameStoryGang2Alternativ", 2]
                }
            },
      
          
           ]
    },
]