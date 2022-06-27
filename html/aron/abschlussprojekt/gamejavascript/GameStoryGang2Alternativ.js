export const gameStoryGang2Alternativ = [
{
    id: 1,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/1",
    options: [
        {
            text: "Next",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 3]
            }
        },
      
       ]
},
{
    id: 2,
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
{
    id: 2,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 3]
            }
        },
        {
            text: "Back",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 2]
            }
        },
      
       ]
},
]