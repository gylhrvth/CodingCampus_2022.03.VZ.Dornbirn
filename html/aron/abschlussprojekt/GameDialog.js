import { gameFight } from './GameFight.js';
import { gameStoryGang1 } from './GameStoryGang1.js';
import { gameStoryGang2 } from './GameStoryGang2.js';

export const gameDialog = [
    
    {
    id: 1,
    img: "Picture/king.jpg",
    text: "Story 3",
    options: [
        {   
            text: "Bandit",
          
            nextText: 2
        },
        {   
           
            text: "Mercenary",
            nextText: 3
        },
        {   
           
            text: "Magician",
            nextText: 4
        },
        {   
           
            text: "Vagabond",
            nextText: 5
        },
       
       ] 
},
{
    id: 2,
    img: "Picture/Picture_Bandit_Hero.webp",
    text: "Bandit\n*Strength:3/5\n*Intelligence:2/5\n*Dexterity:5/5",
    options: [
        {   
             text: "Next",
            nextText: 6
        },
        {
            text: "Back",
            nextText: 1
        },
    ]
},
{
    id: 3,
    img: "Picture/Picture_Mercenary+.webp",
    text: "Mercenary\n*Strength:5/5\n*Intelligence:2/5\n*Dexterity:3/5",
    options: [
        {   
             text: "Next",
            nextText: 6
        },
        {
            text: "Back",
            nextText: 1
        },
    ]
},
{
    id: 4,
    img: "Picture/Picture_Magician.png",
    text: "Magician\n*Strength:2/5\n*Intelligence:5/5\n*Dexterity:3/5",
    options: [
        {   
             text: "Next",
            nextText: 6
        },
        {
            text: "Back",
            nextText: 1
        },
    ]
},
{
    id: 5,
    img: "Picture/Picture_Vagabond.webp",
    text: "Vagabond\n*Strength:4/5\n*Intelligence:3/5\n*Dexterity:3/5",
    options: [
        {   
             text: "Next",
            nextText: 6
        },
        {
            text: "Back",
            nextText: 1
        },
    ]
},
]