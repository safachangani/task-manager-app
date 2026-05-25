import Navbar from "./components/Navbar"
import Home from "./pages/Home"

const App = () => {
  return (
    <div className="p-8">
      <Navbar></Navbar>
      <h1 className="text-3xl font-bold text-blue-600">
        Task Manager
        <Home></Home>
      </h1>
    </div>
  )
}

export default App
