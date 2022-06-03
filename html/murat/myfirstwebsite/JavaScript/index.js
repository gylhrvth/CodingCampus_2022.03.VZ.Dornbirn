function changeButtonClick() {
    let changeBanner = document.getElementById("ChangeBannerButton");
    let random = Math.floor((Math.random() * 10));
    let banner = document.getElementById("Banner");
    let div = document.getElementById("Division2");

    console.log(random);

    switch (random) {
        case 1: banner.src = "Photos/Banner1.jpg";
            break;
        case 2: banner.src = "Photos/Banner2.jpg";
            break;
        case 3: banner.src = "Photos/Banner3.jpg";
            break;
        case 4: banner.src = "Photos/Banner4.jpg";
            break;
        case 5: banner.src = "Photos/Banner5.jpg";
            break;
        case 6: banner.src = "Photos/Banner6.jpg";
            break;
        case 7: banner.src = "Photos/Banner7.jpg";
            break;
        case 8: banner.src = "Photos/Banner8.jpg";
            break;
        case 9: banner.src = "Photos/Banner9.jpg";
            break;
        case 10: banner.src = "Photos/Banner10.jpg";
            break;
        default: banner.src = "Photos/Pokemon1.jpg"
    }

}