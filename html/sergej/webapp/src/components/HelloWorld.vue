<script>
export default {
  props: {
    msg: {
      type: String,
      required: true,
    }
  },
  setup(props) {

    return { dynamicId: "h3", props }
  },


}
</script>

<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>
    <h3 :id="dynamicId">
      You’ve successfully created a project with
      <a target="_blank" href="https://vitejs.dev/">Vite</a> +
      <a target="_blank" href="https://vuejs.org/">Vue 3</a>.
    </h3>
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
  color: red;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {

  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
