import { useParams } from "react-router-dom";
import { products } from "./products";

export function ProductsList(){
    const params =useParams();
    console.log(params.id);
    const id = params.id === undefined ? undefined: parseInt(params.id);
    const selectedProducts = products.find((product) => product.id ===id);
    if (!selectedProducts) {
        return <h2>Product not found</h2>;
    }
  return (<div>
            <h1>{selectedProducts.name}</h1>
            <p>{selectedProducts.description}</p>
            <h3>Price: ₹{selectedProducts.price}</h3>
        </div>);
}