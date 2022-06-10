<template>
  <div>
    <div
      :key="task.id"
      v-for="task in tasks"
      draggable="true"
      @dragstart="startDrag($event, task)"
      @drop="onDrop($event, tasks)"
      @dragover.prevent
      @dragenter.prevent
    >
      <Task
        @toggle-reminder="$emit('toggle-reminder', task.id)"
        @delete-task="$emit('delete-task', task.id)"
        :task="task"
      />
    </div>
  </div>
</template>

<script>
import Task from "./Task";
export default {
  name: "app-tasks",
  props: {
    tasks: Array,
  },

  components: {
    Task,
  },
  methods: {
    startDrag(evt, task) {
      (evt.dataTransfer.dropEffect = "move"),
        (evt.dataTransfer.effectAllowed = "move"),
        evt.dataTransfer.setData("taskID", task.id);
      console.log("dragging " + task.text);
    },
    onDrop(evt, tasks) {
      const taskID = evt.dataTransfer.getData("taskID");
      const task = this.tasks.find((task) => task.id == taskID);
      task.tasks = tasks;
      console.log("dropping " + task.text);
    },
  },
  emits: ["delete-task", "toggle-reminder"],
};
</script>
