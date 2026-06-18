export function ProductList(){
    return(
        <div>
            <h2>Here are some great tools for reatc</h2>
            <ul>
                {ProductList.map((product)=>(
                    <li>{product.name}</li>
                ))}
            </ul>
        </div>
    );
}