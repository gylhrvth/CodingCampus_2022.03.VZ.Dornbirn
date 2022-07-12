function rectangularCollision({ rectangle1, rectangle2 }) {
  return (
    rectangle1.attackBox.position.x + rectangle1.attackBox.width >=
    rectangle2.position.x &&
    rectangle1.attackBox.position.x <=
    rectangle2.position.x + rectangle2.width &&
    rectangle1.attackBox.position.y + rectangle1.attackBox.height >=
    rectangle2.position.y &&
    rectangle1.attackBox.position.y <= rectangle2.position.y + rectangle2.height
  )
}

var resultSet = false

function determineWinner({ player, enemy, timerId }) {
  clearTimeout(timerId)
  document.querySelector('#displayText').style.display = 'flex'

  var result;

  if (player.health === enemy.health) {
    result = "tie"
    document.querySelector('#displayText').innerHTML = 'Tie'
  } else if (player.health > enemy.health) {
    result = "won"
    document.querySelector('#displayText').innerHTML = 'Player Wins'
  } else if (player.health < enemy.health) {
    result = "lost"
    document.querySelector('#displayText').innerHTML = 'You loose'
  }

  if (result) {
    if (!resultSet) {
      resultSet = true
    } else {
      return
    }
    new Promise(resolve => setTimeout(resolve, 3000)).then(() => {
      localStorage.setItem("gameResult", result)
    })
  }
}

let timer = 60
let timerId
function decreaseTimer() {
  if (timer > 0) {
    timerId = setTimeout(decreaseTimer, 1000)
    timer--
    document.querySelector('#timer').innerHTML = timer
  }

  if (timer === 0) {
    determineWinner({ player, enemy, timerId })
  }
}
