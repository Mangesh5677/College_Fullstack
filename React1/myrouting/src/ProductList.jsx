import { Link } from "react-router-dom";
import { products } from "./products";
export function ProductList(){
    return(
        <div>
            <h2>Here are some great tools for react</h2>
            <ul>
                {products.map((product)=>(
                    <Link to={`${product.id}`}>
                    <li key={product.id}>{product.name}</li>
                     </Link>
                ))}
               
            </ul>
        </div>
    );
}