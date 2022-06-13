async function getOrders() {
    const orderHtml = document.getElementById("ordersGet")
    orderHtml.innerHTML = "Loading... Please wait";
    try {
        let response = await fetch("http://localhost:8080/orders/", { method: "GET" });
        if (response.ok) {
            let orders = (await response.json())._embedded;
            var tmp = ""
            for (order of orders.orderList) {
                tmp += order.id + " " + order.description + " " + order.status + "<br>"
            }
            orderHtml.innerHTML = tmp
        } else {
            orderHtml.innerHTML = "No orders could be loaded"
        }
    } catch (err) {
        orderHtml.innerHTML = "No orders could be loaded"
    }
}

async function statusOrder() {
    const orderHtml = document.getElementById("ordersStat")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("numStat")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo, { method: "GET" });
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
}

async function cancelOrder() {
    const orderHtml = document.getElementById("ordersCal")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("number")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo + "/cancel/", { method: "DELETE" });
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
        let response = await fetch("http://localhost:8080/orders/" + orderNo + "/complete/", { method: "PUT" });
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

async function editOrder() {
    const orderHtml = document.getElementById("ordersEd")
    orderHtml.innerHTML = "Loading... Please wait";
    let numEdVar = document.getElementById("numEd")
    let numEdVarVal = numEdVar.value;
    let numEdDesVar = document.getElementById("numEdDes")
    let numEdDesVarVal = numEdDesVar.value;

    try {
        let response = await fetch("http://localhost:8080/orders/" + numEdVarVal, {
            // Adding method type
            method: "PUT",
            // Adding body or contents to send
            body: JSON.stringify({
                description: numEdDesVarVal,
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
            orderHtml.innerHTML =
                "Error: The id is not correct or the description is not between 3 and 200 Characters long"
        }
    } catch (err) {
        orderHtml.innerHTML =
            "Error: The id is not correct or the description is not between 3 and 200 Characters long"
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

async function changeStatusProgress() {
    const orderHtml = document.getElementById("ordersProg")
    orderHtml.innerHTML = "Loading... Please wait";
    let id = document.getElementById("numProg")
    let orderNo = id.value;
    try {
        let response = await fetch("http://localhost:8080/orders/" + orderNo + "/reset/", { method: "PUT" });
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


