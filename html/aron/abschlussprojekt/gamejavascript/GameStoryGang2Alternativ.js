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
    id: 3,
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

{
    id: 4,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 5]
            }
        },
        {
            text: "Back",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 3]
            }
        },
      
       ]
},
{
    id: 5,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 6]
            }
        },
        {
            text: "Back",
            transition: (state) => {
                return ["gameStoryGang2Alternativ", 4]
            }
        },
      
       ]
},
{
    id: 6,
    img: "../Picture/Festung_Kingdom.jpg",
    text: "StoryG2/2",
    options: [
        {
            text: "Next",
            transition: (state) => {
                return ["gameText", 8]
            }
        },
    
      
       ]
},
]