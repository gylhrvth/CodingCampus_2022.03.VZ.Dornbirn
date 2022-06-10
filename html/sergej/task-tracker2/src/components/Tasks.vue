
<template>
  <draggable v-model="arr" item-key="id">
    <template #item="{ element }">
      <Task
        @toggle-reminder="$emit('toggle-reminder', element.id)"
        @delete-task="$emit('delete-task', element.id)"
        :task="element"
      />
    </template>
  </draggable>
</template>

<script>
import Task from "./Task";
import draggable from "vuedraggable";
import { ref } from "@vue/reactivity";
export default {
  name: "app-tasks",
  props: {
    tasks: Array,
  },

  components: {
    Task,
    draggable,
  },
  data(props) {
    const arr = ref(props.tasks);

    return {
      arr,
      drag: false,
    };
  },

  emits: ["delete-task", "toggle-reminder"],
};
</script>
