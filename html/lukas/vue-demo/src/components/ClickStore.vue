<template>
  <div>{{ message }}</div>
  <button @click="() => $store.dispatch('increaseClick')">Increase me</button>
  <button @click="() => $store.dispatch('decreaseClick')">Decrease me</button>
  <div>Clicked: {{ $store.state.clicked }}</div>
</template>
<script>
export default {
  setup() {
    return {
      message: "VUEX Store",
    };
  },
};
</script>
<style scoped>
</style>
