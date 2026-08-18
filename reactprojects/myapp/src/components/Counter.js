import { useState } from "react";
function Counter(){
    const [counterValue,setCounterValue]=useState(0);
    const handleIncrement = () => {
        setCounterValue(counterValue+1);
    }
    const handleDecrement = () => {
        setCounterValue(counterValue-1);
    }
    return <div>
        <h1>Counter Component !!</h1>
        <h2>Counter Value is : {counterValue}</h2>
        <button type="button" 
                onClick={handleIncrement}
                >
                    Increment
        </button>
        <button type="button" onClick={handleDecrement}>Decrement</button>

    </div>
}

export default Counter;