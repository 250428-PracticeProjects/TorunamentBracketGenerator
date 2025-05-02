import './App.css'
import { Routes, Route } from 'react-router-dom';
import Header from './components/Header'
import Players from './views/Players';
import { Bottom } from './components/Bottom';
import Home from './views/Home';


function App() {
  return (
    <div className="flex flex-col min-h-screen  bg-gray-50 dark:bg-gray-900">
      <Header />
      <main className="flex-grow container mx-auto p-4 ">
        <Routes>
          <Route path="/" element={<Home/>} />
          <Route path="/players" element={<Players />} />
        </Routes>
      </main>
      <Bottom />
    </div>
  )
}

export default App
