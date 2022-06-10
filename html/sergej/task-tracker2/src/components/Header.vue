<template>
  <header>
    <h1>{{ title }}</h1>
    <Button
      @toggle-add-task="$emit('toggle-add-task')"
      :text="showAddTask ? 'Close' : 'Add Task'"
      color="green"
    />
  </header>
</template>

<script>
import Button from "./Button";

export default {
  name: "app-header",
  props: {
    title: String,
    showAddTask: Boolean,
  },
  components: {
    Button,
  },
};
</script>
<style scoped>
header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 20px;
}
</style>
