import { Link } from "react-router-dom"

export function Header(){
    return(
        <Header>
            <h1> React Tools</h1>
            <nav>
                <Link to={"products"}>Navigate to products</Link>
            </nav>
        </Header>
    );
}