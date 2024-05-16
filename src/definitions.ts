export interface CapdndPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
