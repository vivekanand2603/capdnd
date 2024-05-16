import { WebPlugin } from '@capacitor/core';
import type { CapdndPlugin } from './definitions';

export class CapdndWeb extends WebPlugin implements CapdndPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async turnOnDoNotDisturb(): Promise<void> {
    console.log('Turning on Do Not Disturb mode on the web is not supported');
  }

  async turnOffDoNotDisturb(): Promise<void> {
    console.log('Turning off Do Not Disturb mode on the web is not supported');
  }
}
