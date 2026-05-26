import type { Priority, Task } from '../types/task'

// Step 1 - define props type
interface TaskCardProps {
  task: Task
  onDelete:(id:string)=>void
}

function getPriorityColor(priority:Priority):string{
  const colors: Record<Priority,string>={
    low:'bg-green-100 text-green-600',
    medium:'bg-yellow-100 text-yellow-600',
    high:   'bg-red-100 text-red-600',
  }
  return colors[priority]
}

// Step 2 - build structure
const TaskCard: React.FC<TaskCardProps> = ({ task,onDelete}) => {
  return (
    <div className="p-4 border rounded-lg shadow-md bg-white">

      {/* Title */}
      <h2 className="text-lg font-bold">{task.title}</h2>

      {/* Description */}
      <p className="text-gray-500 text-sm mt-1">
        {task.description}
      </p>

      {/* Status + Priority */}
      <div className="flex gap-2 mt-3">
        <span className="bg-blue-100 text-blue-600 px-2 py-1 rounded text-xs">
          {task.status}
        </span>
        <span className={`${getPriorityColor(task.priority)} text-red-600 px-2 py-1 rounded text-xs`}>
          {task.priority}
        </span>
      </div>
      {task.dueDate && <span className="bg-red-100 text-red-600 px-2 py-1 rounded text-xs">
        {task.dueDate}
        </span>
}

      <button onClick={()=>onDelete(task.id)}>Delete</button>
    </div>
  )
}

export default TaskCard
