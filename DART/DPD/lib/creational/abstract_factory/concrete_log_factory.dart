import 'abstract_log_factory.dart';
import 'abstract_log_product.dart';
import 'concrete_file_log_product.dart';
import 'concrete_terminal_log_product.dart';

final class ConcreteLogFactory implements AbstractLogFactory {
  @override
  AbstractLogProduct makeFile(String path) => ConcreteFileLogProduct(path);

  @override
  AbstractLogProduct makeTerminal() => ConcreteTerminalLogProduct();
}
