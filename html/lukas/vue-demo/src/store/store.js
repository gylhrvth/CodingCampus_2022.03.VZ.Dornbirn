import { createStore } from "vuex";

export default createStore({
    state() {
        var storedClick = parseInt(localStorage.getItem("clicked"));
        if (isNaN(storedClick)) {
            storedClick = 0
        }
        return {
            clicked: storedClick,
            username: "",
            password: "",
            loginToken: "",
        }
    },
    mutations: {
        changeClick(state, data) {
            state.clicked += data
            localStorage.setItem("clicked", state.clicked)
        }
    },
    actions: {
        increaseClick({ commit }) {
            commit("changeClick", 1)
        },
        decreaseClick({ commit }) {
            commit("changeClick", -1)
        },
    }
});
