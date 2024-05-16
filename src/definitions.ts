export interface CapdndPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  turnOnDoNotDisturb(): Promise<void>;
  turnOffDoNotDisturb(): Promise<void>;
}
