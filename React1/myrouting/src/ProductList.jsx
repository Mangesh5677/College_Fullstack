import { products } from "./products";
export function ProductList(){
    return(
        <div>
            <h2>Here are some great tools for reatc</h2>
            <ul>
                {products.map((product)=>(
                    <li>{product.name}</li>
                ))}
            </ul>
        </div>
    );
}