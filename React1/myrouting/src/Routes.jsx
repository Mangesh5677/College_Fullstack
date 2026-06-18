import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { ProductList } from "./ProductList";
// import App from "./App";
import { Header } from "./Header";
import App from "./App";
import { ProductsList } from "./ProductsList";

const myRouterTree = createBrowserRouter([
  {
    path: "/",
    element: <App />,
  },
  {
    path: "/products",
    element: <ProductList />,
  },
  {
    path:"products/:id/:taskId",
    element:<ProductsList />,

  },
]);

export function Routes() {
  return <RouterProvider router={myRouterTree} />;
}