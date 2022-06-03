<template>
  <div>{{ message }}</div>
  <button @click="() => clicked++">Increase me</button>
  <button @click="decrease">Decrease me</button>
  <div>Clicked: {{ clicked }}</div>
  <div>Tripleclicked: {{ tripleClicked }}</div>
  <div>Modified by other component: {{ $store.state.clicked }}</div>
  <div>PlusA: {{ plusA }}</div>
</template>
<script>
import { computed, ref, watchEffect } from "@vue/runtime-core";
import { useStore } from "vuex";
export default {
  setup() {
    var clicked = ref(0);
    var plusA = ref("");
    var store = useStore();

    watchEffect(() => {
      plusA.value = store.state.clicked + plusA.value + "a";
    });

    function dec() {
      clicked.value--;
    }

    return {
      plusA,
      message: "Reactive value",
      clicked,
      decrease2: dec,
      decrease: () => {
        clicked.value--;
      },
      tripleClicked: computed(() => {
        return clicked.value * 3;
      }),
    };
  },
};
</script>
<style scoped>
</style>
