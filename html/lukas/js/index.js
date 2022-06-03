async function fetchJoke() {
    const loading = document.getElementById("loading");
    const jokeHtml = document.getElementById("joke");
    jokeHtml.innerHTML = "Loading...";
    loading.style.visibility = "visible"

    try {
        let response = await fetch("https://api.chucknorris.io/jokes/random", {
            method: "GET"
        });
        if (response.ok) {
            let joke = (await response.json()).value;
            jokeHtml.innerHTML = joke;
        } else {
            jokeHtml.innerHTML = "Chuck Norris refused to send us jokes...";
        }
    } catch (err) {
        jokeHtml.innerHTML = "Chuck Norris refused to send us jokes...";
    }
    loading.style.visibility = "hidden"
}