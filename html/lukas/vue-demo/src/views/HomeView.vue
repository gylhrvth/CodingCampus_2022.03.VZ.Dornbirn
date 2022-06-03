<script setup>
import ClickStore from "@/components/ClickStore.vue";
import ClickReactive from "@/components/ClickReactive.vue";
import ButtonList from "@/components/ButtonList.vue";
</script>

<template>
  <main>
    <div style="border: 10px solid black">
      <click-store />
    </div>
    <div style="border: 10px solid green">
      <click-reactive />
    </div>
    <div style="border: 10px solid green">
      <button-list />
    </div>
  </main>
</template>
