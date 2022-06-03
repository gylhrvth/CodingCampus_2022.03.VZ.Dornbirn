<template>
  <div class="about">
    <h1>This is an about page</h1>
    <div style="border: 10px solid black">
      <click-store />
      <a href="www.chip.de"><img src="asldkfjasdlkf" /></a>
    </div>
  </div>
</template>
<script setup>
import ClickStore from "@/components/ClickStore.vue";
</script>

<style>
@media (min-width: 200px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
    background-color: yellow;
  }
}
@media (min-width: 400px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
    background-color: blue;
  }
}
@media (min-width: 600px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
    background-color: rgb(99, 72, 13);
  }
}
</style>
