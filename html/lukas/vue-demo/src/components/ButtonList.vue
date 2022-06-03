<template>
  <div v-for="n in count" :key="n">
    <button>{{ n }}</button>
  </div>
</template>
<script>
import { computed } from "@vue/runtime-core";
import { useStore } from "vuex";
export default {
  setup() {
    const store = useStore();
    return {
      count: computed(() => store.state.clicked),
    };
  },
};
</script>
<style scoped>
</style>
