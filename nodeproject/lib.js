export const sqrt = Math.sqrt;
export function square(x) {
     return x * x; 
    }
export function diag(x, y) { 
    return sqrt(square(x) + square(y)); 
}
export class Employees{
    constructor(name){
        this.name = name;
    }
    
    getName(){
        return this.name;
    }
}

