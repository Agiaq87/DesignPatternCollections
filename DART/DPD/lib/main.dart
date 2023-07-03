import 'creational/abstract_factory/abstract_log_factory.dart';
import 'creational/abstract_factory/abstract_log_product.dart';
import 'creational/abstract_factory/concrete_log_factory.dart';

void main() {
  AbstractLogFactory factory = new ConcreteLogFactory();
  AbstractLogProduct file = factory.makeFile("");
  AbstractLogProduct terminal = factory.makeTerminal();

  print("Terminal result: ${terminal.log("TEST ABSTRACT FACTORY")}");
  print("File result: ${file.log("TEST ABSTRACT FACTORY")}");
}