import { createMemoryHistory, createRouter } from 'vue-router'

import ReservasView from './components/ReservasView.vue';

const routes = [
  { path: '/', component: ReservasView }
]

const router = createRouter({
  history: createMemoryHistory(),
  routes,
})

export default router