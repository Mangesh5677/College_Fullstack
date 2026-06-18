import { products } from "./products";
export function ProductList(){
    return(
        <div>
            <h2>Here are some great tools for react</h2>
            <ul>
                {products.map((product)=>(
                    <li>{product.name}</li>
                ))}
            </ul>
        </div>
    );
}