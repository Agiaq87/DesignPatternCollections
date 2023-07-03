import 'abstract_log_product.dart';

abstract class AbstractLogFactory {
  AbstractLogProduct makeTerminal();
  AbstractLogProduct makeFile(final String path);
}
