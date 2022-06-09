async function getOrders() {
    const orderHtml = document.getElementById("ordersGet")
    orderHtml.innerHTML = "Loading... Please wait";
    try {
        let response = await fetch("http://localhost:8080/orders", { method: "GET" });
        if (response.ok) {
            let order = (await response.json())._embedded;
            orderHtml.innerHTML = JSON.stringify(order);
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
}

async function cancelOrder() {
    const orderHtml = document.getElementById("ordersCal")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("number")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo + "/cancel", { method: "DELETE" });
        if (response.ok) {
            let order = (await response.json()).status;
            orderHtml.innerHTML = JSON.stringify(order);
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
    getOrders()
}

async function completeOrder() {
    const orderHtml = document.getElementById("ordersCom")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("numCom")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo + "/complete", { method: "PUT" });
        if (response.ok) {
            let order = (await response.json()).status;
            orderHtml.innerHTML = JSON.stringify(order);
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
    getOrders()
}

async function createOrder() {
    const orderHtml = document.getElementById("ordersCre")
    orderHtml.innerHTML = "Loading... Please wait";
    let description = document.getElementById("description")
    let desVal = description.value;
    try {
        let response = await fetch("http://localhost:8080/orders/", {
            // Adding method type
            method: "POST",
            // Adding body or contents to send
            body: JSON.stringify({
                description: desVal,
            }),

            // Adding headers to the request
            headers: {
                "Content-type": "application/json; charset=UTF-8"
            }
        });
        if (response.ok) {
            const json = await response.json()
            let status = json.status;
            let idOrder = json.id;
            let des = json.description;
            orderHtml.innerHTML = idOrder + "<br>" + des + "<br>" + status + "<br>";
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
    getOrders()
}
async function deleteOrder() {
    const orderHtml = document.getElementById("ordersDel")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("numDel")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo, { method: "DELETE" });
        if (response.ok) {
            orderHtml.innerHTML = "id " + orderNo + " has been deleted!";
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
    getOrders()
}


