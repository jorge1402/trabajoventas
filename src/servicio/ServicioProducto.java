package servicio;
import entidad.Producto;
import entidad.dao.ProductoDao;
public class ServicioProducto {
    public void registroPro(Producto miProducto) throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                miProductoDao.registrarProducto(miProducto);
    }
    public void eliminarPro(String cod)throws Exception{
        ProductoDao miProductoDao;
                miProductoDao = new ProductoDao();				
                miProductoDao.eliminarProdcuto(cod);
    }
}