import React from 'react'
import Navbar from '../components/Navbar'
import TaskCard from '../components/TaskCard'
import type { Task } from '../types/task'

// dummy data to test UI first
const dummyTasks: Task[] = [
  {
    _id: '1',
    title: 'Build Frontend',
    description: 'Create React components',
    status: 'in_progress',
    priority: 'high',
    dueDate: '2026-06-01'
  },
  {
    _id: '2',
    title: 'Setup Backend',
    description: 'Spring Boot API',
    status: 'todo',
    priority: 'medium',
    dueDate: '2026-06-05'
  }
]
function Home() {
  return (
    <div>
      {dummyTasks.map(task => (

        <TaskCard task={task}></TaskCard>
      ))}
    </div>
  )
}

export default Home
